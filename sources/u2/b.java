package u2;

import ch.qos.logback.core.net.server.Client;
import ch.qos.logback.core.net.server.ConcurrentServerRunner;
import ch.qos.logback.core.net.server.ServerListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b extends ConcurrentServerRunner<a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35969c;

    public b(ServerListener<a> serverListener, Executor executor, int i10) {
        super(serverListener, executor);
        this.f35969c = i10;
    }

    @Override // ch.qos.logback.core.net.server.ConcurrentServerRunner
    public boolean configureClient(Client client) {
        a aVar = (a) client;
        aVar.setContext(getContext());
        aVar.S(new ArrayBlockingQueue(this.f35969c));
        return true;
    }
}
