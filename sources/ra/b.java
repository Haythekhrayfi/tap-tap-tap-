package ra;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import fd.s0;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kc.j;
import oc.e;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f35351a = new b();

    @e(c = "com.zipoapps.premiumhelper.configuration.testy.TestyUtils", f = "TestyUtils.kt", l = {24}, m = "checkIfTestyCouldBeUsed")
    public static final class a extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f35352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f35353d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f35355f;

        public a(mc.d<? super a> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f35353d = obj;
            this.f35355f |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, mc.d<? super Boolean> dVar) {
        a aVar;
        boolean zD;
        boolean z10;
        Signature[] signatureArr;
        Object objR;
        Signature signature;
        SigningInfo signingInfo;
        Signature[] apkContentsSigners;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f35355f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f35355f = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objV = aVar.f35353d;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = aVar.f35355f;
        boolean z11 = false;
        if (i11 == 0) {
            h9.d.t(objV);
            try {
                com.zipoapps.premiumhelper.util.c cVar = com.zipoapps.premiumhelper.util.c.f28448a;
                j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
                if (Build.VERSION.SDK_INT >= 28) {
                    PackageInfo packageInfoJ = cVar.j(context, "com.zipoapps.testykal", 134217728);
                    if (packageInfoJ == null || (signingInfo = packageInfoJ.signingInfo) == null || (apkContentsSigners = signingInfo.getApkContentsSigners()) == null) {
                        signature = null;
                    } else {
                        objR = j.r(apkContentsSigners);
                        signature = (Signature) objR;
                    }
                } else {
                    PackageInfo packageInfoJ2 = cVar.j(context, "com.zipoapps.testykal", 64);
                    if (packageInfoJ2 == null || (signatureArr = packageInfoJ2.signatures) == null) {
                        signature = null;
                    } else {
                        objR = j.r(signatureArr);
                        signature = (Signature) objR;
                    }
                }
                if (signature != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
                    try {
                        Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X509").generateCertificate(byteArrayInputStream);
                        X509Certificate x509Certificate = certificateGenerateCertificate instanceof X509Certificate ? (X509Certificate) certificateGenerateCertificate : null;
                        c0.g(byteArrayInputStream, null);
                        if (x509Certificate != null) {
                            zD = j0.d("2e1a4db5f9be9d82747e791845a00669205f3c4", cVar.q(x509Certificate.getPublicKey().toString()));
                        }
                        aVar.f35352c = zD;
                        aVar.f35355f = 1;
                        objV = c0.V(s0.f29620b, new c(context, null), aVar);
                        if (objV == aVar2) {
                            return aVar2;
                        }
                        z10 = zD;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            c0.g(byteArrayInputStream, th);
                            throw th2;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            zD = false;
            aVar.f35352c = zD;
            aVar.f35355f = 1;
            objV = c0.V(s0.f29620b, new c(context, null), aVar);
            if (objV == aVar2) {
                return aVar2;
            }
            z10 = zD;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = aVar.f35352c;
            h9.d.t(objV);
        }
        boolean zBooleanValue = ((Boolean) objV).booleanValue();
        if (z10 && zBooleanValue) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
