package ch.qos.logback.core.spi;

import ch.qos.logback.core.helpers.CyclicBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CyclicBufferTracker<E> extends AbstractComponentTracker<CyclicBuffer<E>> {
    public static final int DEFAULT_BUFFER_SIZE = 256;
    public static final int DEFAULT_NUMBER_OF_BUFFERS = 64;
    public int bufferSize = 256;

    public CyclicBufferTracker() {
        setMaxComponents(64);
    }

    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    public CyclicBuffer<E> buildComponent(String str) {
        return new CyclicBuffer<>(this.bufferSize);
    }

    public int getBufferSize() {
        return this.bufferSize;
    }

    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    public boolean isComponentStale(CyclicBuffer<E> cyclicBuffer) {
        return false;
    }

    public List<String> lingererKeysAsOrderedList() {
        return new ArrayList(this.lingerersMap.keySet());
    }

    public List<String> liveKeysAsOrderedList() {
        return new ArrayList(this.liveMap.keySet());
    }

    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    public void processPriorToRemoval(CyclicBuffer<E> cyclicBuffer) {
        cyclicBuffer.clear();
    }

    public void setBufferSize(int i10) {
        this.bufferSize = i10;
    }
}
