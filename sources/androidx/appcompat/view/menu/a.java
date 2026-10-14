package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LayoutInflater f799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i.a f800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f804k;

    public a(Context context, int i10, int i11) {
        this.f796c = context;
        this.f799f = LayoutInflater.from(context);
        this.f801h = i10;
        this.f802i = i11;
    }

    public abstract void a(g gVar, j.a aVar);

    public boolean b(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View c(g gVar, View view, ViewGroup viewGroup) {
        j.a aVar = view instanceof j.a ? (j.a) view : (j.a) this.f799f.inflate(this.f802i, viewGroup, false);
        a(gVar, aVar);
        return (View) aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean collapseItemActionView(e eVar, g gVar) {
        return false;
    }

    public boolean d(int i10, g gVar) {
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean expandItemActionView(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return this.f804k;
    }

    @Override // androidx.appcompat.view.menu.i
    public void initForMenu(Context context, e eVar) {
        this.f797d = context;
        LayoutInflater.from(context);
        this.f798e = eVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void onCloseMenu(e eVar, boolean z10) {
        i.a aVar = this.f800g;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, z10);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.i
    public boolean onSubMenuSelected(l lVar) {
        i.a aVar = this.f800g;
        e eVar = lVar;
        if (aVar == null) {
            return false;
        }
        if (lVar == null) {
            eVar = this.f798e;
        }
        return aVar.a(eVar);
    }

    @Override // androidx.appcompat.view.menu.i
    public void setCallback(i.a aVar) {
        this.f800g = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f803j;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f798e;
        int i10 = 0;
        if (eVar != null) {
            eVar.flagActionItems();
            ArrayList<g> visibleItems = this.f798e.getVisibleItems();
            int size = visibleItems.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = visibleItems.get(i12);
                if (d(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                    View viewC = c(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewC.setPressed(false);
                        viewC.jumpDrawablesToCurrentState();
                    }
                    if (viewC != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) viewC.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewC);
                        }
                        ((ViewGroup) this.f803j).addView(viewC, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!b(viewGroup, i10)) {
                i10++;
            }
        }
    }
}
