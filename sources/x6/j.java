package x6;

import android.content.Context;
import android.content.Intent;
import com.inscode.autoclicker.plugins.TaskerFireReceiver;
import fd.j0;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends vc.l implements uc.l<v6.a, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskerFireReceiver f37502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f37503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Intent f37504f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z10, TaskerFireReceiver taskerFireReceiver, Context context, Intent intent) {
        super(1);
        this.f37501c = z10;
        this.f37502d = taskerFireReceiver;
        this.f37503e = context;
        this.f37504f = intent;
    }

    @Override // uc.l
    public w invoke(v6.a aVar) {
        j0.i(aVar, "it");
        if (this.f37501c) {
            TaskerFireReceiver taskerFireReceiver = this.f37502d;
            int i10 = TaskerFireReceiver.f13079g;
            taskerFireReceiver.b().b();
            TaskerFireReceiver.a(this.f37502d, this.f37503e, this.f37504f);
        }
        return w.f31842a;
    }
}
