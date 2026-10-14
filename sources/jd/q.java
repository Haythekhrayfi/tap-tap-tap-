package jd;

import fd.j1;
import kd.x;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends vc.l implements uc.p<Integer, mc.f.a, Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o<?> f31876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o<?> oVar) {
        super(2);
        this.f31876c = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001f  */
    @Override // uc.p
    public Integer invoke(Integer num, mc.f.a aVar) {
        int iIntValue = num.intValue();
        mc.f.a aVar2 = aVar;
        mc.f.b<?> key = aVar2.getKey();
        mc.f.a aVarB = this.f31876c.f31869d.b(key);
        int i10 = j1.f29579x1;
        if (key == j1.b.f29580c) {
            j1 j1Var = (j1) aVarB;
            j1 parent = (j1) aVar2;
            while (true) {
                if (parent != null) {
                    if (parent == j1Var || !(parent instanceof x)) {
                        break;
                    }
                    fd.o oVarD0 = ((x) parent).d0();
                    parent = oVarD0 != null ? oVarD0.getParent() : null;
                } else {
                    parent = null;
                    break;
                }
            }
            if (parent != j1Var) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + j1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
            }
            if (j1Var != null) {
                iIntValue++;
            }
        } else if (aVar2 != aVarB) {
            iIntValue = Integer.MIN_VALUE;
        } else {
            iIntValue++;
        }
        return Integer.valueOf(iIntValue);
    }
}
