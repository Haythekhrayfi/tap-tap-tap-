package u2;

import ch.qos.logback.core.net.server.Client;
import ch.qos.logback.core.spi.ContextAware;
import java.io.Serializable;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public interface a extends Client, ContextAware {
    void S(BlockingQueue<Serializable> blockingQueue);

    boolean o(Serializable serializable);
}
