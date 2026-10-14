package y6;

import android.content.Intent;
import android.widget.Toast;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.combine.CombinationActivity;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;
import com.inscode.autoclicker.ui.main.MainActivity;
import com.inscode.autoclicker.ui.main.OnServiceTurnedOffEvent;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends vc.l implements uc.l<b7.a, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f38290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j jVar) {
        super(1);
        this.f38290c = jVar;
    }

    @Override // uc.l
    public jc.w invoke(b7.a aVar) {
        Intent intent;
        b7.a aVar2 = aVar;
        fd.j0.i(aVar2, "it");
        int i10 = aVar2.f3344a;
        if (i10 != 0) {
            if (i10 == 1) {
                j jVar = this.f38290c;
                j.a aVar3 = j.f38212r;
                if (jVar.l().n()) {
                    Toast.makeText(this.f38290c.j(), this.f38290c.j().getString(R.string.combination_not_selected), 1).show();
                } else {
                    CombinationActivity.a aVar4 = CombinationActivity.f13209j;
                    t6.a aVarI = this.f38290c.l().i();
                    Objects.requireNonNull(aVar4);
                    CombinationActivity.f13210k = aVarI;
                    intent = new Intent(this.f38290c.j(), (Class<?>) CombinationActivity.class);
                }
            } else if (i10 == 2) {
                j jVar2 = this.f38290c;
                j.a aVar5 = j.f38212r;
                intent = new Intent(jVar2.j(), (Class<?>) MainActivity.class);
            } else if (i10 == 3) {
                this.f38290c.a();
                this.f38290c.k().d(OnServiceTurnedOffEvent.INSTANCE);
            }
            return jc.w.f31842a;
        }
        j jVar3 = this.f38290c;
        j.a aVar6 = j.f38212r;
        intent = new Intent(jVar3.j(), (Class<?>) CombinedRecordingsActivity.class);
        intent.setFlags(268435456);
        this.f38290c.j().startActivity(intent);
        return jc.w.f31842a;
    }
}
