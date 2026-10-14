package o5;

import a5.d;
import a5.f;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import g6.b;
import g6.c;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f33961b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f33962c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f33963d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f33964e = new a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f33965f = new a(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33966a;

    public /* synthetic */ a(int i10) {
        this.f33966a = i10;
    }

    @Override // a5.f
    public final Object a(d dVar) {
        switch (this.f33966a) {
            case 0:
                return TransportRegistrar.lambda$getComponents$0(dVar);
            case 1:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(dVar);
            case 2:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(dVar);
            case 3:
                Set setD = dVar.d(g6.d.class);
                c cVar = c.f30012c;
                if (cVar == null) {
                    synchronized (c.class) {
                        cVar = c.f30012c;
                        if (cVar == null) {
                            cVar = new c(0);
                            c.f30012c = cVar;
                        }
                        break;
                    }
                }
                return new b(setD, cVar);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(dVar);
        }
    }
}
