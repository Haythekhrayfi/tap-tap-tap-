package i8;

import android.view.View;
import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import y9.o8;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8[] f31396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f31397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f31398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f31399f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(o8[] o8VarArr, n0 n0Var, k kVar, View view) {
        super(0);
        this.f31396c = o8VarArr;
        this.f31397d = n0Var;
        this.f31398e = kVar;
        this.f31399f = view;
    }

    @Override // uc.a
    public jc.w invoke() {
        o8[] o8VarArr = this.f31396c;
        n0 n0Var = this.f31397d;
        k kVar = this.f31398e;
        View view = this.f31399f;
        int length = o8VarArr.length;
        int i10 = 0;
        while (i10 < length) {
            o8 o8Var = o8VarArr[i10];
            i10++;
            Objects.requireNonNull(n0Var);
            fd.j0.i(kVar, Action.SCOPE_ATTRIBUTE);
            fd.j0.i(view, "view");
            fd.j0.i(o8Var, "action");
            g gVarF = x1.q.f(kVar, o8Var);
            Map<g, Integer> map = n0Var.f31394e;
            Integer num = map.get(gVarF);
            if (num == null) {
                num = 0;
                map.put(gVarF, num);
            }
            int iIntValue = num.intValue();
            long jLongValue = o8Var.f41856c.b(kVar.getExpressionResolver()).longValue();
            if (jLongValue == 0 || iIntValue < jLongValue) {
                if (n0Var.f31392c.getUseActionUid()) {
                    String string = UUID.randomUUID().toString();
                    fd.j0.h(string, "randomUUID().toString()");
                    p7.j actionHandler = kVar.getActionHandler();
                    if (!(actionHandler == null ? false : actionHandler.handleAction(o8Var, kVar, string)) && !n0Var.f31392c.handleAction(o8Var, kVar, string)) {
                        n0Var.f31390a.n(kVar, view, o8Var, string);
                        n0Var.f31393d.b(o8Var, kVar.getExpressionResolver());
                    }
                } else {
                    p7.j actionHandler2 = kVar.getActionHandler();
                    if (!(actionHandler2 == null ? false : actionHandler2.handleAction(o8Var, kVar)) && !n0Var.f31392c.handleAction(o8Var, kVar)) {
                        n0Var.f31390a.e(kVar, view, o8Var);
                        n0Var.f31393d.b(o8Var, kVar.getExpressionResolver());
                    }
                }
                n0Var.f31394e.put(gVarF, Integer.valueOf(iIntValue + 1));
                e9.c cVar = e9.c.f29122a;
            }
        }
        return jc.w.f31842a;
    }
}
