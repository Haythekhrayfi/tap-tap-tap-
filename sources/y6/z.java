package y6;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends vc.l implements uc.l<List<String>, me.a<? extends List<? extends t6.a>>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f38434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(s sVar) {
        super(1);
        this.f38434c = sVar;
    }

    @Override // uc.l
    public me.a<? extends List<? extends t6.a>> invoke(List<String> list) {
        fd.j0.i(list, "it");
        return this.f38434c.f38379c.a().o();
    }
}
