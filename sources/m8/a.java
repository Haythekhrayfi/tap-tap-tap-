package m8;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.inscode.autoclicker.R;
import i8.j0;
import i8.k;
import i8.q0;
import i8.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import jc.h;
import jc.w;
import l8.v;
import l8.w3;
import o8.m;
import o8.r;
import o8.t;
import p0.i0;
import s7.g;
import uc.p;
import y9.t2;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f33268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f33269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<u> f33270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f33271d;

    /* JADX INFO: renamed from: m8.a$a, reason: collision with other inner class name */
    public static final class C0357a extends w3<b> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final k f33272i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final u f33273j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final j0 f33274k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final p<View, y9.k, w> f33275l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final c8.e f33276m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final WeakHashMap<y9.k, Long> f33277n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f33278o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final List<p7.d> f33279p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0357a(List<? extends y9.k> list, k kVar, u uVar, j0 j0Var, p<? super View, ? super y9.k, w> pVar, c8.e eVar) {
            super(list, kVar);
            fd.j0.i(list, "divs");
            fd.j0.i(kVar, "div2View");
            fd.j0.i(uVar, "divBinder");
            fd.j0.i(j0Var, "viewCreator");
            fd.j0.i(pVar, "itemStateBinder");
            fd.j0.i(eVar, "path");
            this.f33272i = kVar;
            this.f33273j = uVar;
            this.f33274k = j0Var;
            this.f33275l = pVar;
            this.f33276m = eVar;
            this.f33277n = new WeakHashMap<>();
            this.f33279p = new ArrayList();
            setHasStableIds(true);
            e();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int getItemCount() {
            return this.f32934f.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public long getItemId(int i10) {
            y9.k kVar = this.f32934f.get(i10);
            Long l10 = this.f33277n.get(kVar);
            if (l10 != null) {
                return l10.longValue();
            }
            long j10 = this.f33278o;
            this.f33278o = 1 + j10;
            this.f33277n.put(kVar, Long.valueOf(j10));
            return j10;
        }

        @Override // f9.b
        public List<p7.d> getSubscriptions() {
            return this.f33279p;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onBindViewHolder(RecyclerView.c0 c0Var, int i10) {
            View viewN;
            b bVar = (b) c0Var;
            fd.j0.i(bVar, "holder");
            k kVar = this.f33272i;
            y9.k kVar2 = this.f32934f.get(i10);
            c8.e eVar = this.f33276m;
            fd.j0.i(kVar, "div2View");
            fd.j0.i(kVar2, "div");
            fd.j0.i(eVar, "path");
            v9.d expressionResolver = kVar.getExpressionResolver();
            if (bVar.f33283d == null || bVar.f33280a.getChild() == null || !j8.a.b(bVar.f33283d, kVar2, expressionResolver)) {
                viewN = bVar.f33282c.n(kVar2, expressionResolver);
                u8.g gVar = bVar.f33280a;
                fd.j0.i(gVar, "<this>");
                fd.j0.i(kVar, "divView");
                Iterator<View> it = ((i0.a) i0.b(gVar)).iterator();
                while (true) {
                    p0.j0 j0Var = (p0.j0) it;
                    if (!j0Var.hasNext()) {
                        break;
                    }
                    u1.a.u(kVar.getReleaseViewVisitor$div_release(), (View) j0Var.next());
                }
                gVar.removeAllViews();
                bVar.f33280a.addView(viewN);
            } else {
                viewN = bVar.f33280a.getChild();
                fd.j0.f(viewN);
            }
            bVar.f33283d = kVar2;
            bVar.f33281b.b(viewN, kVar2, kVar, eVar);
            bVar.f33280a.setTag(R.id.div_gallery_item_index, Integer.valueOf(i10));
            this.f33273j.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
            fd.j0.i(viewGroup, "parent");
            Context context = this.f33272i.getContext();
            fd.j0.h(context, "div2View.context");
            return new b(new u8.g(context, null, 0, 6, null), this.f33273j, this.f33274k);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onViewAttachedToWindow(RecyclerView.c0 c0Var) {
            b bVar = (b) c0Var;
            fd.j0.i(bVar, "holder");
            super.onViewAttachedToWindow(bVar);
            y9.k kVar = bVar.f33283d;
            if (kVar == null) {
                return;
            }
            this.f33275l.invoke(bVar.f33280a, kVar);
        }
    }

    public static final class b extends RecyclerView.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u8.g f33280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f33281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j0 f33282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public y9.k f33283d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u8.g gVar, u uVar, j0 j0Var) {
            super(gVar);
            fd.j0.i(gVar, "rootView");
            fd.j0.i(uVar, "divBinder");
            fd.j0.i(j0Var, "viewCreator");
            this.f33280a = gVar;
            this.f33281b = uVar;
            this.f33282c = j0Var;
        }
    }

    public static final class c extends RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f33284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f33285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f33286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t2 f33287d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f33288e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f33289f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f33290g;

        public c(k kVar, m mVar, f fVar, t2 t2Var) {
            fd.j0.i(kVar, "divView");
            fd.j0.i(mVar, "recycler");
            fd.j0.i(fVar, "galleryItemHelper");
            fd.j0.i(t2Var, "galleryDiv");
            this.f33284a = kVar;
            this.f33285b = mVar;
            this.f33286c = fVar;
            this.f33287d = t2Var;
            Objects.requireNonNull(kVar.getConfig());
            this.f33290g = "next";
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            fd.j0.i(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 1) {
                this.f33289f = false;
            }
            if (i10 == 0) {
                ((r7.a.b) this.f33284a.getDiv2Component$div_release()).a().l(this.f33284a, this.f33287d, this.f33286c.l(), this.f33286c.e(), this.f33290g);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            fd.j0.i(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i10, i11);
            int iQ = this.f33286c.q() / 20;
            int iAbs = Math.abs(i11) + Math.abs(i10) + this.f33288e;
            this.f33288e = iAbs;
            if (iAbs <= iQ) {
                return;
            }
            this.f33288e = 0;
            if (!this.f33289f) {
                this.f33289f = true;
                ((r7.a.b) this.f33284a.getDiv2Component$div_release()).a().a(this.f33284a);
                this.f33290g = (i10 > 0 || i11 > 0) ? "next" : "back";
            }
            Iterator<View> it = ((i0.a) i0.b(this.f33285b)).iterator();
            while (true) {
                p0.j0 j0Var = (p0.j0) it;
                if (!j0Var.hasNext()) {
                    return;
                }
                View view = (View) j0Var.next();
                int childAdapterPosition = this.f33285b.getChildAdapterPosition(view);
                RecyclerView.g adapter = this.f33285b.getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryBinder.GalleryAdapter");
                y9.k kVar = ((C0357a) adapter).f32932d.get(childAdapterPosition);
                q0 q0VarD = ((r7.a.b) this.f33284a.getDiv2Component$div_release()).d();
                fd.j0.h(q0VarD, "divView.div2Component.visibilityActionTracker");
                q0VarD.d(this.f33284a, view, kVar, (8 & 8) != 0 ? l8.b.A(kVar.a()) : null);
            }
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f33292b;

        static {
            int[] iArr = new int[t2.j.values().length];
            iArr[t2.j.DEFAULT.ordinal()] = 1;
            iArr[t2.j.PAGING.ordinal()] = 2;
            f33291a = iArr;
            int[] iArr2 = new int[t2.i.values().length];
            iArr2[t2.i.HORIZONTAL.ordinal()] = 1;
            iArr2[t2.i.VERTICAL.ordinal()] = 2;
            f33292b = iArr2;
        }
    }

    public static final class e extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<r> f33293a;

        public e(List<r> list) {
            this.f33293a = list;
        }

        @Override // o8.t
        public void n(r rVar) {
            this.f33293a.add(rVar);
        }
    }

    public a(v vVar, j0 j0Var, ic.a<u> aVar, g gVar) {
        fd.j0.i(vVar, "baseBinder");
        fd.j0.i(j0Var, "viewCreator");
        fd.j0.i(aVar, "divBinder");
        fd.j0.i(gVar, "divPatchCache");
        this.f33268a = vVar;
        this.f33269b = j0Var;
        this.f33270c = aVar;
        this.f33271d = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view, List<? extends y9.k> list, k kVar) {
        y9.k kVar2;
        ArrayList<r> arrayList = new ArrayList();
        u1.a.u(new e(arrayList), view);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (r rVar : arrayList) {
            c8.e path = rVar.getPath();
            if (path != null) {
                Object arrayList2 = linkedHashMap.get(path);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(path, arrayList2);
                }
                ((Collection) arrayList2).add(rVar);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c8.e path2 = ((r) it.next()).getPath();
            if (path2 != null) {
                arrayList3.add(path2);
            }
        }
        for (c8.e eVar : c8.a.f3624a.a(arrayList3)) {
            Iterator<T> it2 = list.iterator();
            do {
                kVar2 = null;
                if (!it2.hasNext()) {
                    break;
                }
                y9.k kVarB = (y9.k) it2.next();
                fd.j0.i(kVarB, "<this>");
                fd.j0.i(eVar, "path");
                List<h<String, String>> list2 = eVar.f3633b;
                if (!list2.isEmpty()) {
                    Iterator<T> it3 = list2.iterator();
                    do {
                        if (!it3.hasNext()) {
                            kVar2 = kVarB;
                            break;
                        }
                        kVarB = c8.a.f3624a.b(kVarB, (String) ((h) it3.next()).f31811c);
                    } while (kVarB != null);
                }
            } while (kVar2 == null);
            List list3 = (List) linkedHashMap.get(eVar);
            if (kVar2 != null && list3 != null) {
                u uVar = this.f33270c.get();
                c8.e eVarD = eVar.d();
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    uVar.b((r) it4.next(), kVar2, kVar, eVarD);
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v0 ??, still in use, count: 2, list:
          (r15v0 ?? I:??[OBJECT, ARRAY]) from 0x0064: MOVE (r19v0 ?? I:??[OBJECT, ARRAY]) = (r15v0 ?? I:??[OBJECT, ARRAY])
          (r15v0 ?? I:??[OBJECT, ARRAY]) from 0x005b: MOVE (r19v2 ?? I:??[OBJECT, ARRAY]) = (r15v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1413)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1424)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1468)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:247)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void b(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v0 ??, still in use, count: 2, list:
          (r15v0 ?? I:??[OBJECT, ARRAY]) from 0x0064: MOVE (r19v0 ?? I:??[OBJECT, ARRAY]) = (r15v0 ?? I:??[OBJECT, ARRAY])
          (r15v0 ?? I:??[OBJECT, ARRAY]) from 0x005b: MOVE (r19v2 ?? I:??[OBJECT, ARRAY]) = (r15v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1413)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1424)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1468)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:247)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */
}
