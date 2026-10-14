package ch.qos.logback.core.recovery;

import android.support.v4.media.b;
import ch.qos.logback.core.net.SyslogOutputStream;
import defpackage.a;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public class ResilientSyslogOutputStream extends ResilientOutputStreamBase {
    public int port;
    public String syslogHost;

    public ResilientSyslogOutputStream(String str, int i10) throws SocketException, UnknownHostException {
        this.syslogHost = str;
        this.port = i10;
        this.os = new SyslogOutputStream(str, i10);
        this.presumedClean = true;
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    public String getDescription() {
        StringBuilder sbA = a.a("syslog [");
        sbA.append(this.syslogHost);
        sbA.append(":");
        return b.a(sbA, this.port, "]");
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    public OutputStream openNewOutputStream() throws IOException {
        return new SyslogOutputStream(this.syslogHost, this.port);
    }

    public String toString() {
        StringBuilder sbA = a.a("c.q.l.c.recovery.ResilientSyslogOutputStream@");
        sbA.append(System.identityHashCode(this));
        return sbA.toString();
    }
}
