package x6;

import com.inscode.autoclicker.plugins.TaskerFireReceiver;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends vc.l implements uc.l<w, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskerFireReceiver f37514d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z10, TaskerFireReceiver taskerFireReceiver) {
        super(1);
        this.f37513c = z10;
        this.f37514d = taskerFireReceiver;
    }

    @Override // uc.l
    public w invoke(w wVar) {
        if (this.f37513c) {
            TaskerFireReceiver taskerFireReceiver = this.f37514d;
            int i10 = TaskerFireReceiver.f13079g;
            taskerFireReceiver.b().e();
        }
        return w.f31842a;
    }
}
