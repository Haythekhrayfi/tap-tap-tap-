package com.inscode.autoclicker.base;

import jc.w;
import uc.p;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class DragAndDropItemAdapter$onViewMoved$1 extends l implements p<Integer, Integer, w> {
    public final /* synthetic */ DragAndDropItemAdapter<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropItemAdapter$onViewMoved$1(DragAndDropItemAdapter<T> dragAndDropItemAdapter) {
        super(2);
        this.this$0 = dragAndDropItemAdapter;
    }

    @Override // uc.p
    public /* bridge */ /* synthetic */ w invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return w.f31842a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void invoke(int i10, int i11) {
        Object obj = this.this$0.getData().get(i10);
        this.this$0.getData().remove(obj);
        this.this$0.getData().add(i11, obj);
        this.this$0.notifyItemMoved(i10, i11);
        this.this$0.getOnDataChanged().invoke(this.this$0.getData());
    }
}
