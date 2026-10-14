package okhttp3;

import fd.j0;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kc.j;

/* JADX INFO: loaded from: classes3.dex */
public interface Dns {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final Dns SYSTEM = new Companion.DnsSystem();

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public List<InetAddress> lookup(String str) throws UnknownHostException {
                j0.i(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    j0.h(allByName, "getAllByName(hostname)");
                    return j.B(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException(j0.p("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
