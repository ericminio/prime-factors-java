package support;

import org.junit.Test;

import java.util.Observable;
import java.util.Observer;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TddReadyTest {

    @Test
    public void canAssert() {
        assertThat(1+1, equalTo(2));
    }

    @Test
    public void canMock() {
        class MyObservable extends Observable {
            public void changeSomething(Object any) {
                setChanged();
                notifyObservers(any);
            }
        }
        Observer observer = mock(Observer.class);
        MyObservable observable = new MyObservable();
        observable.addObserver(observer);
        Object any = new Object();
        observable.changeSomething(any);

        verify(observer).update(observable, any);
    }
}
