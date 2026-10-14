package qd;

import fd.j0;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Socket f34944a;

    public z(Socket socket) {
        j0.i(socket, "socket");
        this.f34944a = socket;
    }

    @Override // qd.a
    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // qd.a
    public void timedOut() {
        Level level;
        StringBuilder sb2;
        Logger logger;
        Throwable th;
        try {
            this.f34944a.close();
        } catch (AssertionError e10) {
            if (!o.d(e10)) {
                throw e10;
            }
            Logger logger2 = p.f34912a;
            level = Level.WARNING;
            sb2 = new StringBuilder();
            th = e10;
            logger = logger2;
            sb2.append("Failed to close timed out socket ");
            sb2.append(this.f34944a);
            logger.log(level, sb2.toString(), th);
        } catch (Exception e11) {
            Logger logger3 = p.f34912a;
            level = Level.WARNING;
            sb2 = new StringBuilder();
            th = e11;
            logger = logger3;
            sb2.append("Failed to close timed out socket ");
            sb2.append(this.f34944a);
            logger.log(level, sb2.toString(), th);
        }
    }
}
