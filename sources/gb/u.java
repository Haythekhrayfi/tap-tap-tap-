package gb;

import android.content.SharedPreferences;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements InstallReferrerStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InstallReferrerClient f30406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f30407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fd.i<String> f30408c;

    /* JADX WARN: Multi-variable type inference failed */
    public u(InstallReferrerClient installReferrerClient, v vVar, fd.i<? super String> iVar) {
        this.f30406a = installReferrerClient;
        this.f30407b = vVar;
        this.f30408c = iVar;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i10) {
        try {
            if (i10 == 0) {
                String installReferrer = this.f30406a.getInstallReferrer().getInstallReferrer();
                ma.f fVar = this.f30407b.f30410b;
                j0.h(installReferrer, "referrer");
                Objects.requireNonNull(fVar);
                SharedPreferences.Editor editorEdit = fVar.f33405a.edit();
                editorEdit.putString("install_referrer", installReferrer);
                editorEdit.apply();
                xe.a.b("PremiumHelper").a("Install referrer: " + installReferrer, new Object[0]);
                if (this.f30408c.a()) {
                    fd.i<String> iVar = this.f30408c;
                    jc.i.a aVar = jc.i.f31813c;
                    iVar.resumeWith(installReferrer);
                }
            } else if (this.f30408c.a()) {
                fd.i<String> iVar2 = this.f30408c;
                jc.i.a aVar2 = jc.i.f31813c;
                iVar2.resumeWith("");
            }
            try {
                this.f30406a.endConnection();
            } catch (Throwable unused) {
            }
        } catch (RemoteException unused2) {
            if (this.f30408c.a()) {
                fd.i<String> iVar3 = this.f30408c;
                jc.i.a aVar3 = jc.i.f31813c;
                iVar3.resumeWith("");
            }
        }
    }
}
