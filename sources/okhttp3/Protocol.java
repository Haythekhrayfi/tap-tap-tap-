package okhttp3;

import fd.j0;
import java.io.IOException;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final Companion Companion = new Companion(null);
    private final String protocol;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Protocol get(String str) throws IOException {
            j0.i(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!j0.d(str, protocol.protocol)) {
                protocol = Protocol.HTTP_1_1;
                if (!j0.d(str, protocol.protocol)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!j0.d(str, protocol.protocol)) {
                        protocol = Protocol.HTTP_2;
                        if (!j0.d(str, protocol.protocol)) {
                            protocol = Protocol.SPDY_3;
                            if (!j0.d(str, protocol.protocol)) {
                                protocol = Protocol.QUIC;
                                if (!j0.d(str, protocol.protocol)) {
                                    throw new IOException(j0.p("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) throws IOException {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
