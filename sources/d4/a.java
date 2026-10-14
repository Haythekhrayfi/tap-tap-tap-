package d4;

import android.animation.TypeEvaluator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements TypeEvaluator<Number> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f28639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<InterfaceC0245a> f28640b = new ArrayList<>();

    /* JADX INFO: renamed from: d4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0245a {
        void a(float f10, float f11, float f12, float f13, float f14);
    }

    public a(float f10) {
        this.f28639a = f10;
    }

    public abstract Float a(float f10, float f11, float f12, float f13);

    @Override // android.animation.TypeEvaluator
    public Number evaluate(float f10, Number number, Number number2) {
        Number number3 = number;
        float f11 = this.f28639a * f10;
        float fFloatValue = number3.floatValue();
        float fFloatValue2 = number2.floatValue() - number3.floatValue();
        float f12 = this.f28639a;
        float fFloatValue3 = a(f11, fFloatValue, fFloatValue2, f12).floatValue();
        Iterator<InterfaceC0245a> it = this.f28640b.iterator();
        while (it.hasNext()) {
            it.next().a(f11, fFloatValue3, fFloatValue, fFloatValue2, f12);
        }
        return Float.valueOf(fFloatValue3);
    }
}
