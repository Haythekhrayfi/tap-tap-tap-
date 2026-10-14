package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import uc.a;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class Handshake$Companion$handshake$1 extends l implements a<List<? extends Certificate>> {
    public final /* synthetic */ List<Certificate> $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$Companion$handshake$1(List<? extends Certificate> list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // uc.a
    public final List<? extends Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
