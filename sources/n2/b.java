package n2;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.net.server.Client;
import ch.qos.logback.core.net.server.ConcurrentServerRunner;
import ch.qos.logback.core.net.server.ServerListener;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b extends ConcurrentServerRunner<a> {
    public b(ServerListener<a> serverListener, Executor executor) {
        super(serverListener, executor);
    }

    @Override // ch.qos.logback.core.net.server.ConcurrentServerRunner
    public boolean configureClient(Client client) {
        ((a) client).setLoggerContext((LoggerContext) getContext());
        return true;
    }
}
