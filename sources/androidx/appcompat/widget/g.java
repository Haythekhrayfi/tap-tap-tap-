package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes.dex */
public class g extends CheckedTextView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f1220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f1221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f1222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f1223f;

    public g(Context context) {
        this(context, null);
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i10) {
        int iM;
        int iM2;
        super(context, attributeSet, i10);
        v0.a(context);
        t0.a(this, getContext());
        w wVar = new w(this);
        this.f1222e = wVar;
        wVar.g(attributeSet, i10);
        wVar.b();
        e eVar = new e(this);
        this.f1221d = eVar;
        eVar.d(attributeSet, i10);
        h hVar = new h(this);
        this.f1220c = hVar;
        Context context2 = getContext();
        int[] iArr = d.a.f28470l;
        y0 y0VarR = y0.r(context2, attributeSet, iArr, i10, 0);
        p0.e0.p(this, getContext(), iArr, attributeSet, y0VarR.f1412b, i10, 0);
        boolean z10 = true;
        try {
            if (!y0VarR.p(1) || (iM2 = y0VarR.m(1, 0)) == 0) {
                z10 = false;
            } else {
                try {
                    setCheckMarkDrawable(e.a.b(getContext(), iM2));
                } catch (Resources.NotFoundException unused) {
                    z10 = false;
                }
            }
            if (!z10 && y0VarR.p(0) && (iM = y0VarR.m(0, 0)) != 0) {
                CheckedTextView checkedTextView = hVar.f1227a;
                checkedTextView.setCheckMarkDrawable(e.a.b(checkedTextView.getContext(), iM));
            }
            if (y0VarR.p(2)) {
                hVar.f1227a.setCheckMarkTintList(y0VarR.c(2));
            }
            if (y0VarR.p(3)) {
                hVar.f1227a.setCheckMarkTintMode(c0.d(y0VarR.j(3, -1), null));
            }
            y0VarR.f1412b.recycle();
            getEmojiTextViewHelper().b(attributeSet, i10);
        } catch (Throwable th) {
            y0VarR.f1412b.recycle();
            throw th;
        }
    }

    private m getEmojiTextViewHelper() {
        if (this.f1223f == null) {
            this.f1223f = new m(this);
        }
        return this.f1223f;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        w wVar = this.f1222e;
        if (wVar != null) {
            wVar.b();
        }
        e eVar = this.f1221d;
        if (eVar != null) {
            eVar.a();
        }
        h hVar = this.f1220c;
        if (hVar != null) {
            hVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1221d;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1221d;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        h hVar = this.f1220c;
        if (hVar != null) {
            return hVar.f1228b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        h hVar = this.f1220c;
        if (hVar != null) {
            return hVar.f1229c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1222e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1222e.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        androidx.activity.i.m(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().f1300b.f44989a.c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1221d;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1221d;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(e.a.b(getContext(), i10));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        h hVar = this.f1220c;
        if (hVar != null) {
            if (hVar.f1232f) {
                hVar.f1232f = false;
            } else {
                hVar.f1232f = true;
                hVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w wVar = this.f1222e;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w wVar = this.f1222e;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.g(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().f1300b.f44989a.d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1221d;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1221d;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        h hVar = this.f1220c;
        if (hVar != null) {
            hVar.f1228b = colorStateList;
            hVar.f1230d = true;
            hVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        h hVar = this.f1220c;
        if (hVar != null) {
            hVar.f1229c = mode;
            hVar.f1231e = true;
            hVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1222e.m(colorStateList);
        this.f1222e.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1222e.n(mode);
        this.f1222e.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        w wVar = this.f1222e;
        if (wVar != null) {
            wVar.h(context, i10);
        }
    }
}
