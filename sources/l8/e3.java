package l8;

import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import ch.qos.logback.core.CoreConstants;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e3 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y9.s3 f32343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc.a0<g8.a> f32344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o8.h f32345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ KeyListener f32346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v9.d f32347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ uc.l<g8.a, jc.w> f32348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ uc.p<Exception, uc.a<jc.w>, jc.w> f32349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q8.d f32350j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e3(y9.s3 s3Var, vc.a0<g8.a> a0Var, o8.h hVar, KeyListener keyListener, v9.d dVar, uc.l<? super g8.a, jc.w> lVar, uc.p<? super Exception, ? super uc.a<jc.w>, jc.w> pVar, q8.d dVar2) {
        super(1);
        this.f32343c = s3Var;
        this.f32344d = a0Var;
        this.f32345e = hVar;
        this.f32346f = keyListener;
        this.f32347g = dVar;
        this.f32348h = lVar;
        this.f32349i = pVar;
        this.f32350j = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [g8.b] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [g8.c] */
    @Override // uc.l
    public jc.w invoke(Object obj) {
        Locale localeForLanguageTag;
        fd.j0.i(obj, "$noName_0");
        y9.t3 t3Var = this.f32343c.f42548x;
        T bVar = 0;
        bVar = 0;
        bVar = 0;
        y9.u3 u3VarA = t3Var == null ? null : t3Var.a();
        vc.a0<g8.a> a0Var = this.f32344d;
        if (u3VarA instanceof y9.i2) {
            this.f32345e.setKeyListener(this.f32346f);
            y9.i2 i2Var = (y9.i2) u3VarA;
            String strB = i2Var.f40568b.b(this.f32347g);
            List<y9.i2.b> list = i2Var.f40569c;
            v9.d dVar = this.f32347g;
            ArrayList arrayList = new ArrayList(kc.m.j(list, 10));
            for (y9.i2.b bVar2 : list) {
                char cA0 = ed.w.a0(bVar2.f40576a.b(dVar));
                v9.b<String> bVar3 = bVar2.f40578c;
                arrayList.add(new g8.a.c(cA0, bVar3 == null ? null : bVar3.b(dVar), ed.w.a0(bVar2.f40577b.b(dVar))));
            }
            g8.a.b bVar4 = new g8.a.b(strB, arrayList, i2Var.f40567a.b(this.f32347g).booleanValue());
            g8.a aVar = this.f32344d.f36988c;
            if (aVar != null) {
                aVar.n(bVar4, true);
                bVar = aVar;
            }
            if (bVar == 0) {
                bVar = new g8.c(bVar4, new b3(this.f32349i));
            }
        } else if (u3VarA instanceof y9.f1) {
            v9.b<String> bVar5 = ((y9.f1) u3VarA).f39929a;
            String strB2 = bVar5 == null ? null : bVar5.b(this.f32347g);
            if (strB2 != null) {
                localeForLanguageTag = Locale.forLanguageTag(strB2);
                q8.d dVar2 = this.f32350j;
                String languageTag = localeForLanguageTag.toLanguageTag();
                if (!fd.j0.d(languageTag, strB2)) {
                    dVar2.b(new IllegalArgumentException("Original locale tag '" + ((Object) strB2) + "' is not equals to final one '" + ((Object) languageTag) + CoreConstants.SINGLE_QUOTE_CHAR));
                }
            } else {
                localeForLanguageTag = Locale.getDefault();
            }
            this.f32345e.setKeyListener(DigitsKeyListener.getInstance("1234567890.,"));
            g8.a aVar2 = this.f32344d.f36988c;
            g8.a aVar3 = aVar2;
            if (aVar3 != null) {
                Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.yandex.div.core.util.mask.CurrencyInputMask");
                g8.b bVar6 = (g8.b) aVar2;
                fd.j0.h(localeForLanguageTag, "locale");
                fd.j0.i(localeForLanguageTag, "locale");
                String strP = ed.q.p(bVar6.h(), bVar6.p().getDecimalSeparator(), CoreConstants.DOT, false, 4);
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(localeForLanguageTag);
                fd.j0.h(currencyInstance, "getCurrencyInstance(locale)");
                bVar6.o(currencyInstance);
                bVar6.f30047h = currencyInstance;
                bVar6.a(ed.q.p(strP, CoreConstants.DOT, bVar6.p().getDecimalSeparator(), false, 4), null);
                bVar = aVar3;
            }
            if (bVar == 0) {
                fd.j0.h(localeForLanguageTag, "locale");
                bVar = new g8.b(localeForLanguageTag, new d3(this.f32349i));
            }
        } else {
            this.f32345e.setKeyListener(this.f32346f);
        }
        a0Var.f36988c = bVar;
        this.f32348h.invoke(this.f32344d.f36988c);
        return jc.w.f31842a;
    }
}
