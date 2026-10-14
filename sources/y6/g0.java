package y6;

import android.content.Intent;
import com.inscode.autoclicker.service.manual.settings.WidgetManualSettingsActivity;
import com.inscode.autoclicker.ui.main.MainActivity;
import com.inscode.autoclicker.ui.main.OnServiceTurnedOffEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends vc.l implements uc.l<b7.a, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f38194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(d0 d0Var) {
        super(1);
        this.f38194c = d0Var;
    }

    @Override // uc.l
    public jc.w invoke(b7.a aVar) {
        Intent intent;
        b7.a aVar2 = aVar;
        fd.j0.i(aVar2, "it");
        int i10 = aVar2.f3344a;
        if (i10 != 0) {
            if (i10 == 1) {
                d0 d0Var = this.f38194c;
                d0.a aVar3 = d0.f38116t;
                intent = new Intent(d0Var.q(), (Class<?>) MainActivity.class);
            } else if (i10 == 2) {
                this.f38194c.a();
                ((q6.b) this.f38194c.f38121i.getValue()).d(OnServiceTurnedOffEvent.INSTANCE);
            }
            return jc.w.f31842a;
        }
        d0 d0Var2 = this.f38194c;
        d0.a aVar4 = d0.f38116t;
        d0Var2.r().r(d0.k(this.f38194c, false, 1));
        intent = new Intent(this.f38194c.q(), (Class<?>) WidgetManualSettingsActivity.class);
        intent.setFlags(268435456);
        this.f38194c.q().startActivity(intent);
        return jc.w.f31842a;
    }
}
