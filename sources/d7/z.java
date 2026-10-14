package d7;

import com.inscode.autoclicker.shortcut.ShortcutActivity;
import com.inscode.autoclicker.ui.main.MainActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements pb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc.l f28846d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public /* synthetic */ z(uc.l lVar, int i10) {
        this.f28845c = i10;
        switch (i10) {
        }
        this.f28846d = lVar;
    }

    @Override // pb.b
    public final void accept(Object obj) {
        switch (this.f28845c) {
            case 0:
                uc.l lVar = this.f28846d;
                fd.j0.i(lVar, "$tmp0");
                lVar.invoke(obj);
                break;
            case 1:
                uc.l lVar2 = this.f28846d;
                fd.j0.i(lVar2, "$tmp0");
                lVar2.invoke(obj);
                break;
            case 2:
                uc.l lVar3 = this.f28846d;
                int i10 = ShortcutActivity.f13310h;
                fd.j0.i(lVar3, "$tmp0");
                lVar3.invoke(obj);
                break;
            case 3:
                uc.l lVar4 = this.f28846d;
                int i11 = ShortcutActivity.f13310h;
                fd.j0.i(lVar4, "$tmp0");
                lVar4.invoke(obj);
                break;
            case 4:
                uc.l lVar5 = this.f28846d;
                int i12 = ShortcutActivity.f13310h;
                fd.j0.i(lVar5, "$tmp0");
                lVar5.invoke(obj);
                break;
            case 5:
                uc.l lVar6 = this.f28846d;
                int i13 = ShortcutActivity.f13310h;
                fd.j0.i(lVar6, "$tmp0");
                lVar6.invoke(obj);
                break;
            case 6:
                uc.l lVar7 = this.f28846d;
                int i14 = ShortcutActivity.f13310h;
                fd.j0.i(lVar7, "$tmp0");
                lVar7.invoke(obj);
                break;
            case 7:
                uc.l lVar8 = this.f28846d;
                int i15 = ShortcutActivity.f13310h;
                fd.j0.i(lVar8, "$tmp0");
                lVar8.invoke(obj);
                break;
            case 8:
                MainActivity.checkIntent$lambda$1(this.f28846d, obj);
                break;
            case 9:
                MainActivity.checkIntent$lambda$2(this.f28846d, obj);
                break;
            case 10:
                MainActivity.checkIntent$lambda$4(this.f28846d, obj);
                break;
            case 11:
                MainActivity.checkIntent$lambda$5(this.f28846d, obj);
                break;
            case 12:
                MainActivity.checkIntent$lambda$7(this.f28846d, obj);
                break;
            default:
                MainActivity.checkIntent$lambda$8(this.f28846d, obj);
                break;
        }
    }
}
