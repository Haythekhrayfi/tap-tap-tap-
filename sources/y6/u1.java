package y6;

import android.content.Intent;
import com.inscode.autoclicker.service.record.settings.WidgetRecordSettingsActivity;
import com.inscode.autoclicker.ui.main.MainActivity;
import com.inscode.autoclicker.ui.main.OnServiceTurnedOffEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 extends vc.l implements uc.l<b7.a, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1 f38396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(o1 o1Var) {
        super(1);
        this.f38396c = o1Var;
    }

    @Override // uc.l
    public jc.w invoke(b7.a aVar) {
        Intent intent;
        b7.a aVar2 = aVar;
        fd.j0.i(aVar2, "it");
        int i10 = aVar2.f3344a;
        if (i10 != 0) {
            if (i10 == 1) {
                o1 o1Var = this.f38396c;
                o1.a aVar3 = o1.f38296s;
                intent = new Intent(o1Var.k(), (Class<?>) MainActivity.class);
            } else if (i10 == 2) {
                this.f38396c.a();
                this.f38396c.l().d(OnServiceTurnedOffEvent.INSTANCE);
            }
            return jc.w.f31842a;
        }
        o1 o1Var2 = this.f38396c;
        o1.a aVar4 = o1.f38296s;
        intent = new Intent(o1Var2.k(), (Class<?>) WidgetRecordSettingsActivity.class);
        intent.setFlags(268435456);
        this.f38396c.k().startActivity(intent);
        return jc.w.f31842a;
    }
}
