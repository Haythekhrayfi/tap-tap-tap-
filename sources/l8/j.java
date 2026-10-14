package l8;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.j f32460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7.h f32461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l8.c f32462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f32463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f32465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uc.l<View, Boolean> f32466g;

    public final class a extends q9.b.a.C0392a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i8.k f32467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<y9.q.d> f32468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f32469c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(j jVar, i8.k kVar, List<? extends y9.q.d> list) {
            fd.j0.i(jVar, "this$0");
            fd.j0.i(kVar, "divView");
            fd.j0.i(list, "items");
            this.f32469c = jVar;
            this.f32467a = kVar;
            this.f32468b = list;
        }

        @Override // q9.b.a.C0392a, q9.b.a
        public void a(androidx.appcompat.widget.k0 k0Var) {
            final v9.d expressionResolver = this.f32467a.getExpressionResolver();
            androidx.appcompat.view.menu.e eVar = k0Var.f1282a;
            fd.j0.h(eVar, "popupMenu.menu");
            for (final y9.q.d dVar : this.f32468b) {
                final int size = eVar.size();
                MenuItem menuItemAdd = eVar.add(dVar.f42110c.b(expressionResolver));
                final j jVar = this.f32469c;
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l8.h
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        j.a aVar = this.f32408c;
                        y9.q.d dVar2 = dVar;
                        j jVar2 = jVar;
                        int i10 = size;
                        v9.d dVar3 = expressionResolver;
                        fd.j0.i(aVar, "this$0");
                        fd.j0.i(dVar2, "$itemData");
                        fd.j0.i(jVar2, "this$1");
                        fd.j0.i(dVar3, "$expressionResolver");
                        fd.j0.i(menuItem, "it");
                        vc.v vVar = new vc.v();
                        aVar.f32467a.r(new i(dVar2, vVar, jVar2, aVar, i10, dVar3));
                        return vVar.f37003c;
                    }
                });
            }
        }
    }

    public static final class b extends vc.l implements uc.a<jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<y9.q> f32470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f32471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j f32472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ i8.k f32473f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ View f32474g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends y9.q> list, String str, j jVar, i8.k kVar, View view) {
            super(0);
            this.f32470c = list;
            this.f32471d = str;
            this.f32472e = jVar;
            this.f32473f = kVar;
            this.f32474g = view;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:29:0x007b  */
        @Override // uc.a
        public jc.w invoke() {
            p7.h hVar;
            Boolean bool;
            String string = UUID.randomUUID().toString();
            fd.j0.h(string, "randomUUID().toString()");
            List<y9.q> list = this.f32470c;
            String str = this.f32471d;
            j jVar = this.f32472e;
            i8.k kVar = this.f32473f;
            View view = this.f32474g;
            for (y9.q qVar : list) {
                switch (str) {
                    case "long_click":
                        jVar.f32461b.r(kVar, view, qVar, string);
                        break;
                    case "blur":
                        hVar = jVar.f32461b;
                        bool = Boolean.FALSE;
                        hVar.o(kVar, view, qVar, bool);
                        break;
                    case "click":
                        jVar.f32461b.q(kVar, view, qVar, string);
                        break;
                    case "focus":
                        hVar = jVar.f32461b;
                        bool = Boolean.TRUE;
                        hVar.o(kVar, view, qVar, bool);
                        break;
                    case "double_click":
                        jVar.f32461b.m(kVar, view, qVar, string);
                        break;
                    default:
                        int i10 = e9.a.f29114a;
                        break;
                }
                jVar.f32462c.a(qVar, kVar.getExpressionResolver());
                jVar.a(kVar, qVar, string);
            }
            return jc.w.f31842a;
        }
    }

    public static final class c extends vc.l implements uc.l<View, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f32475c = new c();

        public c() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5, types: [android.view.View, android.view.ViewGroup] */
        /* JADX WARN: Type inference failed for: r3v8 */
        @Override // uc.l
        public Boolean invoke(View view) {
            ViewGroup viewGroup;
            View view2 = view;
            fd.j0.i(view2, "view");
            boolean zPerformLongClick = false;
            while (true) {
                ViewParent parent = view2.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    view2 = 0;
                }
                if (view2 == 0 || view2.getParent() == null || (zPerformLongClick = view2.performLongClick())) {
                    view2 = viewGroup;
                    break;
                }
                view2 = viewGroup;
            }
            return Boolean.valueOf(zPerformLongClick);
        }
    }

    public j(p7.j jVar, p7.h hVar, l8.c cVar, boolean z10, boolean z11, boolean z12) {
        fd.j0.i(jVar, "actionHandler");
        fd.j0.i(hVar, "logger");
        fd.j0.i(cVar, "divActionBeaconSender");
        this.f32460a = jVar;
        this.f32461b = hVar;
        this.f32462c = cVar;
        this.f32463d = z10;
        this.f32464e = z11;
        this.f32465f = z12;
        this.f32466g = c.f32475c;
    }

    public void a(i8.k kVar, y9.q qVar, String str) {
        fd.j0.i(kVar, "divView");
        fd.j0.i(qVar, "action");
        p7.j actionHandler = kVar.getActionHandler();
        if (!this.f32460a.getUseActionUid() || str == null) {
            if (actionHandler == null || !actionHandler.handleAction(qVar, kVar)) {
                this.f32460a.handleAction(qVar, kVar);
                return;
            }
            return;
        }
        if (actionHandler == null || !actionHandler.handleAction(qVar, kVar, str)) {
            this.f32460a.handleAction(qVar, kVar, str);
        }
    }

    public void c(i8.k kVar, View view, List<? extends y9.q> list, String str) {
        fd.j0.i(kVar, "divView");
        fd.j0.i(view, "target");
        fd.j0.i(list, "actions");
        fd.j0.i(str, "actionLogType");
        kVar.r(new b(list, str, this, kVar, view));
    }
}
