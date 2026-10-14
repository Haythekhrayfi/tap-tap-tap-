package n8;

import fd.j0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements t9.c.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f33629b;

    public /* synthetic */ b(List list, int i10) {
        this.f33628a = i10;
        if (i10 != 1) {
            this.f33629b = list;
        } else {
            this.f33629b = list;
        }
    }

    public final List a() {
        switch (this.f33628a) {
            case 0:
                List list = this.f33629b;
                j0.i(list, "$list");
                return list;
            case 1:
                List list2 = this.f33629b;
                int i10 = d.f33639k;
                j0.i(list2, "$list");
                return list2;
            default:
                List list3 = this.f33629b;
                int i11 = d.f33639k;
                j0.i(list3, "$list");
                return list3;
        }
    }
}
