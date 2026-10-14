package d6;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements w5.a.InterfaceC0445a, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f28729a;

    public /* synthetic */ o(FirebaseMessaging firebaseMessaging, int i10) {
        this.f28729a = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        com.google.firebase.messaging.i iVar = (com.google.firebase.messaging.i) obj;
        if (this.f28729a.f12597g.b()) {
            iVar.f();
        }
    }
}
