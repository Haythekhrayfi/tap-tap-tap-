package ch.qos.logback.core.net;

import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class AutoFlushingObjectWriter implements ObjectWriter {
    private final ObjectOutputStream objectOutputStream;
    private final int resetFrequency;
    private int writeCounter = 0;

    public AutoFlushingObjectWriter(ObjectOutputStream objectOutputStream, int i10) {
        this.objectOutputStream = objectOutputStream;
        this.resetFrequency = i10;
    }

    private void preventMemoryLeak() throws IOException {
        int i10 = this.writeCounter + 1;
        this.writeCounter = i10;
        if (i10 >= this.resetFrequency) {
            this.objectOutputStream.reset();
            this.writeCounter = 0;
        }
    }

    @Override // ch.qos.logback.core.net.ObjectWriter
    public void write(Object obj) throws IOException {
        this.objectOutputStream.writeObject(obj);
        this.objectOutputStream.flush();
        preventMemoryLeak();
    }
}
