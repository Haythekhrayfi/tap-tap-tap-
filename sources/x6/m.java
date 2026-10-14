package x6;

import android.content.Context;
import android.content.Intent;
import com.inscode.autoclicker.plugins.TaskerFireReceiver;
import fd.j0;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends vc.l implements uc.l<t6.a, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskerFireReceiver f37510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f37511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Intent f37512f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z10, TaskerFireReceiver taskerFireReceiver, Context context, Intent intent) {
        super(1);
        this.f37509c = z10;
        this.f37510d = taskerFireReceiver;
        this.f37511e = context;
        this.f37512f = intent;
    }

    @Override // uc.l
    public w invoke(t6.a aVar) {
        j0.i(aVar, "it");
        if (this.f37509c) {
            TaskerFireReceiver taskerFireReceiver = this.f37510d;
            int i10 = TaskerFireReceiver.f13079g;
            taskerFireReceiver.b().b();
            TaskerFireReceiver.a(this.f37510d, this.f37511e, this.f37512f);
        }
        return w.f31842a;
    }
}
