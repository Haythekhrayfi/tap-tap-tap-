package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.HardenedObjectInputStream;
import ch.qos.logback.core.util.CloseUtil;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public class b implements n2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Socket f3686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InputStream f3687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LoggerContext f3688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Logger f3689g;

    public b(String str, InputStream inputStream) {
        this.f3685c = str;
        this.f3686d = null;
        this.f3687e = inputStream;
    }

    public b(String str, Socket socket) {
        this.f3685c = str;
        this.f3686d = socket;
        this.f3687e = null;
    }

    public final HardenedObjectInputStream a() throws IOException {
        return this.f3687e != null ? new HardenedLoggingEventInputStream(this.f3687e) : new HardenedLoggingEventInputStream(this.f3686d.getInputStream());
    }

    @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = this.f3686d;
        if (socket == null) {
            return;
        }
        CloseUtil.closeQuietly(socket);
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger logger;
        StringBuilder sb2;
        this.f3689g.info(this + ": connected");
        HardenedObjectInputStream hardenedObjectInputStreamA = null;
        try {
            try {
                try {
                    hardenedObjectInputStreamA = a();
                    while (true) {
                        ILoggingEvent iLoggingEvent = (ILoggingEvent) hardenedObjectInputStreamA.readObject();
                        Logger logger2 = this.f3688f.getLogger(iLoggingEvent.getLoggerName());
                        if (logger2.isEnabledFor(iLoggingEvent.getLevel())) {
                            logger2.callAppenders(iLoggingEvent);
                        }
                    }
                } catch (EOFException unused) {
                    if (hardenedObjectInputStreamA != null) {
                        CloseUtil.closeQuietly(hardenedObjectInputStreamA);
                    }
                    close();
                    logger = this.f3689g;
                    sb2 = new StringBuilder();
                    sb2.append(this);
                    sb2.append(": connection closed");
                    logger.info(sb2.toString());
                } catch (ClassNotFoundException unused2) {
                    this.f3689g.error(this + ": unknown event class");
                    if (hardenedObjectInputStreamA != null) {
                        CloseUtil.closeQuietly(hardenedObjectInputStreamA);
                    }
                    close();
                    logger = this.f3689g;
                    sb2 = new StringBuilder();
                    sb2.append(this);
                    sb2.append(": connection closed");
                    logger.info(sb2.toString());
                }
            } catch (IOException e10) {
                this.f3689g.info(this + ": " + e10);
                if (hardenedObjectInputStreamA != null) {
                    CloseUtil.closeQuietly(hardenedObjectInputStreamA);
                }
                close();
                logger = this.f3689g;
                sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(": connection closed");
                logger.info(sb2.toString());
            } catch (RuntimeException e11) {
                this.f3689g.error(this + ": " + e11);
                if (hardenedObjectInputStreamA != null) {
                    CloseUtil.closeQuietly(hardenedObjectInputStreamA);
                }
                close();
                logger = this.f3689g;
                sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(": connection closed");
                logger.info(sb2.toString());
            }
        } catch (Throwable th) {
            if (hardenedObjectInputStreamA != null) {
                CloseUtil.closeQuietly(hardenedObjectInputStreamA);
            }
            close();
            this.f3689g.info(this + ": connection closed");
            throw th;
        }
    }

    @Override // n2.a
    public void setLoggerContext(LoggerContext loggerContext) {
        this.f3688f = loggerContext;
        this.f3689g = loggerContext.getLogger(b.class.getPackage().getName());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("client ");
        sbA.append(this.f3685c);
        return sbA.toString();
    }
}
