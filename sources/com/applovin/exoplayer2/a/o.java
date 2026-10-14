package com.applovin.exoplayer2.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements com.applovin.exoplayer2.l.p.a, t9.o.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3987e;

    public /* synthetic */ o(b.a aVar, int i10, int i11) {
        this.f3985c = i11;
        if (i11 == 1) {
            this.f3986d = aVar;
            this.f3987e = i10;
        } else if (i11 == 2) {
            this.f3986d = aVar;
            this.f3987e = i10;
        } else if (i11 != 3) {
            this.f3986d = aVar;
            this.f3987e = i10;
        } else {
            this.f3986d = aVar;
            this.f3987e = i10;
        }
    }

    public /* synthetic */ o(t9.a aVar, int i10) {
        this.f3985c = 5;
        this.f3986d = aVar;
        this.f3987e = i10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v0 ??, still in use, count: 1, list:
          (r11v0 ?? I:java.lang.Object) from 0x0069: INVOKE (r0v6 ?? I:java.util.Map), (r13v4 ?? I:java.lang.Object), (r11v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public int a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v0 ??, still in use, count: 1, list:
          (r11v0 ?? I:java.lang.Object) from 0x0069: INVOKE (r0v6 ?? I:java.util.Map), (r13v4 ?? I:java.lang.Object), (r11v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v0 ??
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

    @Override // com.applovin.exoplayer2.l.p.a
    public void invoke(Object obj) {
        switch (this.f3985c) {
            case 0:
                ((b) obj).b((b.a) this.f3986d, this.f3987e);
                break;
            case 1:
                a.a((b.a) this.f3986d, this.f3987e, (b) obj);
                break;
            case 2:
                ((b) obj).e((b.a) this.f3986d, this.f3987e);
                break;
            case 3:
                ((b) obj).a((b.a) this.f3986d, this.f3987e);
                break;
            default:
                ((b) obj).c((b.a) this.f3986d, this.f3987e);
                break;
        }
    }
}
