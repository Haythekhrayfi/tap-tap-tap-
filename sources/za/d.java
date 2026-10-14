package za;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import com.zipoapps.premiumhelper.ui.rate.RateBarDialog;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements RateBarDialog.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RateBarDialog f45219a;

    public d(RateBarDialog rateBarDialog) {
        this.f45219a = rateBarDialog;
    }

    @Override // com.zipoapps.premiumhelper.ui.rate.RateBarDialog.b
    public int a(int i10) {
        if (i10 == 0) {
            return R.drawable.rate_smile_1;
        }
        if (i10 == 1) {
            return R.drawable.rate_smile_2;
        }
        if (i10 != 2) {
            return i10 != 3 ? R.drawable.rate_smile_5 : R.drawable.rate_smile_4;
        }
        return R.drawable.rate_smile_3;
    }

    @Override // com.zipoapps.premiumhelper.ui.rate.RateBarDialog.b
    public Drawable b(int i10) {
        Context contextRequireContext = this.f45219a.requireContext();
        j0.h(contextRequireContext, "requireContext()");
        RateBarDialog rateBarDialog = this.f45219a;
        RateBarDialog.a aVar = RateBarDialog.f28330s;
        i.b bVarC = rateBarDialog.c();
        j0.i(contextRequireContext, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(bVarC, "style");
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {-16842910};
        OvalShape ovalShape = new OvalShape();
        ovalShape.resize(50.0f, 50.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(0);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        Integer num = bVarC.f45240b;
        int iIntValue = num != null ? num.intValue() : R.color.rate_us_cta_btn_disabled;
        Paint paint = shapeDrawable.getPaint();
        Object obj = e0.a.f28964a;
        paint.setColor(e0.a.d.a(contextRequireContext, iIntValue));
        stateListDrawable.addState(iArr, shapeDrawable);
        int[] iArr2 = {android.R.attr.state_selected};
        OvalShape ovalShape2 = new OvalShape();
        ovalShape2.resize(50.0f, 50.0f);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(ovalShape2);
        shapeDrawable2.getPaint().setColor(0);
        shapeDrawable2.getPaint().setStyle(Paint.Style.FILL);
        Paint paint2 = shapeDrawable2.getPaint();
        int i11 = bVarC.f45239a;
        Object obj2 = e0.a.f28964a;
        paint2.setColor(e0.a.d.a(contextRequireContext, i11));
        stateListDrawable.addState(iArr2, shapeDrawable2);
        int[] iArr3 = {android.R.attr.state_enabled};
        OvalShape ovalShape3 = new OvalShape();
        ovalShape3.resize(50.0f, 50.0f);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(ovalShape3);
        shapeDrawable3.getPaint().setColor(0);
        shapeDrawable3.getPaint().setStyle(Paint.Style.FILL);
        stateListDrawable.addState(iArr3, shapeDrawable3);
        return stateListDrawable;
    }
}
