package z9;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import vc.f0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45202a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<OnCompleteListener<AppSetIdInfo>> f45203b = new ArrayList();

    public static final class a<TResult> implements OnCompleteListener<AppSetIdInfo> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z9.a f45205b;

        public a(z9.a aVar) {
            this.f45205b = aVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<AppSetIdInfo> task) {
            c cVar;
            synchronized (b.this.f45202a) {
                b bVar = b.this;
                List<OnCompleteListener<AppSetIdInfo>> list = bVar.f45203b;
                if (list == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                }
                f0.a(list).remove(bVar);
            }
            j0.h(task, "it");
            if (!task.isSuccessful()) {
                this.f45205b.a(task.getException());
                return;
            }
            z9.a aVar = this.f45205b;
            AppSetIdInfo result = task.getResult();
            j0.h(result, "it.result");
            String id2 = result.getId();
            b bVar2 = b.this;
            AppSetIdInfo result2 = task.getResult();
            j0.h(result2, "it.result");
            int scope = result2.getScope();
            Objects.requireNonNull(bVar2);
            if (scope != 1) {
                cVar = scope != 2 ? c.UNKNOWN : c.DEVELOPER;
            } else {
                cVar = c.APP;
            }
            aVar.a(id2, cVar);
        }
    }

    @Override // z9.d
    public void a(Context context, z9.a aVar) throws Throwable {
        AppSetIdClient client = AppSet.getClient(context);
        j0.h(client, "AppSet.getClient(context)");
        Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
        j0.h(appSetIdInfo, "client.appSetIdInfo");
        a aVar2 = new a(aVar);
        synchronized (this.f45202a) {
            this.f45203b.add(aVar2);
        }
        appSetIdInfo.addOnCompleteListener(aVar2);
    }
}
