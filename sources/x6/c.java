package x6;

import android.content.Context;
import android.content.Intent;
import com.inscode.autoclicker.plugins.TaskerFireReceiver;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends vc.l implements uc.l<Boolean, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskerFireReceiver f37478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f37479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Intent f37480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TaskerFireReceiver taskerFireReceiver, Context context, Intent intent) {
        super(1);
        this.f37478c = taskerFireReceiver;
        this.f37479d = context;
        this.f37480e = intent;
    }

    @Override // uc.l
    public w invoke(Boolean bool) {
        TaskerFireReceiver taskerFireReceiver = this.f37478c;
        int i10 = TaskerFireReceiver.f13079g;
        taskerFireReceiver.c();
        nd.a.C0371a.c(this.f37479d, this.f37480e, -1, null);
        this.f37478c.f13083f.d();
        return w.f31842a;
    }
}
