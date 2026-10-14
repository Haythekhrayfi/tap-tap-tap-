package ch.qos.logback.classic.net;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import ch.qos.logback.classic.spi.ILoggingEvent;
import defpackage.a;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;

/* JADX INFO: loaded from: classes.dex */
public class SocketNode implements Runnable {
    public boolean closed = false;
    public LoggerContext context;
    public HardenedLoggingEventInputStream hardenedLoggingEventInputStream;
    public Logger logger;
    public SocketAddress remoteSocketAddress;
    public Socket socket;
    public SimpleSocketServer socketServer;

    public SocketNode(SimpleSocketServer simpleSocketServer, Socket socket, LoggerContext loggerContext) {
        this.socketServer = simpleSocketServer;
        this.socket = socket;
        this.remoteSocketAddress = socket.getRemoteSocketAddress();
        this.context = loggerContext;
        this.logger = loggerContext.getLogger(SocketNode.class);
    }

    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        HardenedLoggingEventInputStream hardenedLoggingEventInputStream = this.hardenedLoggingEventInputStream;
        if (hardenedLoggingEventInputStream != null) {
            try {
                try {
                    hardenedLoggingEventInputStream.close();
                } catch (IOException e10) {
                    this.logger.warn("Could not close connection.", (Throwable) e10);
                }
            } finally {
                this.hardenedLoggingEventInputStream = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger logger;
        String str;
        try {
            this.hardenedLoggingEventInputStream = new HardenedLoggingEventInputStream(new BufferedInputStream(this.socket.getInputStream()));
        } catch (Exception e10) {
            Logger logger2 = this.logger;
            StringBuilder sbA = a.a("Could not open ObjectInputStream to ");
            sbA.append(this.socket);
            logger2.error(sbA.toString(), (Throwable) e10);
            this.closed = true;
        }
        while (!this.closed) {
            try {
                ILoggingEvent iLoggingEvent = (ILoggingEvent) this.hardenedLoggingEventInputStream.readObject();
                Logger logger3 = this.context.getLogger(iLoggingEvent.getLoggerName());
                if (logger3.isEnabledFor(iLoggingEvent.getLevel())) {
                    logger3.callAppenders(iLoggingEvent);
                }
            } catch (EOFException unused) {
                logger = this.logger;
                str = "Caught java.io.EOFException closing connection.";
                logger.info(str);
            } catch (SocketException unused2) {
                logger = this.logger;
                str = "Caught java.net.SocketException closing connection.";
                logger.info(str);
            } catch (IOException e11) {
                this.logger.info("Caught java.io.IOException: " + e11);
                logger = this.logger;
                str = "Closing connection.";
                logger.info(str);
            } catch (Exception e12) {
                this.logger.error("Unexpected exception. Closing connection.", (Throwable) e12);
            }
        }
        this.socketServer.socketNodeClosing(this);
        close();
    }

    public String toString() {
        return getClass().getName() + this.remoteSocketAddress.toString();
    }
}
