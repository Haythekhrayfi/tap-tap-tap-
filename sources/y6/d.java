package y6;

import android.view.View;
import com.inscode.autoclicker.service.AdbActivity;
import com.inscode.autoclicker.ui.main.MoreSettingsActivity;
import com.inscode.autoclicker.ui.prepare.PrepareActivity;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38114c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38115d;

    public /* synthetic */ d(MoreSettingsActivity moreSettingsActivity) {
        this.f38115d = moreSettingsActivity;
    }

    public /* synthetic */ d(PrepareActivity prepareActivity) {
        this.f38115d = prepareActivity;
    }

    public /* synthetic */ d(m9.l lVar) {
        this.f38115d = lVar;
    }

    public /* synthetic */ d(q8.j jVar) {
        this.f38115d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f38114c) {
            case 0:
                AdbActivity adbActivity = (AdbActivity) this.f38115d;
                int i10 = AdbActivity.f13097d;
                fd.j0.i(adbActivity, "this$0");
                ProcessPhoenix.a(adbActivity);
                return;
            case 1:
                MoreSettingsActivity.onCreate$lambda$0((MoreSettingsActivity) this.f38115d, view);
                return;
            case 2:
                PrepareActivity.prepareBackup$lambda$3((PrepareActivity) this.f38115d, view);
                return;
            case 3:
                q8.j jVar = (q8.j) this.f38115d;
                fd.j0.i(jVar, "this$0");
                q8.h hVar = jVar.f34825d;
                hVar.a(q8.m.a(hVar.f34821g, true, 0, 0, null, null, 30));
                return;
            case 4:
                m9.l lVar = (m9.l) this.f38115d;
                int i11 = m9.l.f33374t;
                fd.j0.i(lVar, "this$0");
                androidx.appcompat.widget.d0 d0Var = lVar.f33376s.f1235e;
                if (d0Var != null) {
                    d0Var.setSelectionAfterHeaderView();
                }
                lVar.f33376s.show();
                return;
            default:
                q9.b bVar = (q9.b) this.f38115d;
                Objects.requireNonNull(bVar);
                androidx.appcompat.widget.k0 k0Var = new androidx.appcompat.widget.k0(view.getContext(), view, bVar.f34849c);
                q9.b.a aVar = bVar.f34850d;
                if (aVar != null) {
                    aVar.a(k0Var);
                }
                if (!k0Var.f1284c.f()) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                q9.b.a aVar2 = bVar.f34850d;
                if (aVar2 != null) {
                    aVar2.b();
                    return;
                }
                return;
        }
    }
}
