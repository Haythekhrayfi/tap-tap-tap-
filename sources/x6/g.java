package x6;

import android.content.Context;
import android.content.Intent;
import com.inscode.autoclicker.plugins.TaskerFireReceiver;
import fd.j0;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends vc.l implements uc.l<u6.a, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskerFireReceiver f37494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f37495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Intent f37496f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z10, TaskerFireReceiver taskerFireReceiver, Context context, Intent intent) {
        super(1);
        this.f37493c = z10;
        this.f37494d = taskerFireReceiver;
        this.f37495e = context;
        this.f37496f = intent;
    }

    @Override // uc.l
    public w invoke(u6.a aVar) {
        j0.i(aVar, "it");
        if (this.f37493c) {
            TaskerFireReceiver taskerFireReceiver = this.f37494d;
            int i10 = TaskerFireReceiver.f13079g;
            taskerFireReceiver.b().b();
            TaskerFireReceiver.a(this.f37494d, this.f37495e, this.f37496f);
        }
        return w.f31842a;
    }
}
