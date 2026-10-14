package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import ch.qos.logback.core.joran.action.Action;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends androidx.fragment.app.k implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DialogPreference f2334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f2335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f2336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f2337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f2338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BitmapDrawable f2340i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2341j;

    public static class a {
        public static void a(Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    public DialogPreference b() {
        if (this.f2334c == null) {
            this.f2334c = (DialogPreference) ((DialogPreference.a) getTargetFragment()).a(requireArguments().getString(Action.KEY_ATTRIBUTE));
        }
        return this.f2334c;
    }

    public void c(View view) {
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f2338g;
            int i10 = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i10 = 0;
            }
            if (viewFindViewById.getVisibility() != i10) {
                viewFindViewById.setVisibility(i10);
            }
        }
    }

    public abstract void d(boolean z10);

    public void e(androidx.appcompat.app.g.a aVar) {
    }

    public void f() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f2341j = i10;
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        super.onCreate(bundle);
        androidx.lifecycle.h targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        String string = requireArguments().getString(Action.KEY_ATTRIBUTE);
        if (bundle != null) {
            this.f2335d = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f2336e = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f2337f = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f2338g = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f2339h = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f2340i = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.a(string);
        this.f2334c = dialogPreference;
        this.f2335d = dialogPreference.O;
        this.f2336e = dialogPreference.R;
        this.f2337f = dialogPreference.S;
        this.f2338g = dialogPreference.P;
        this.f2339h = dialogPreference.T;
        Drawable drawable = dialogPreference.Q;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            bitmapDrawable = new BitmapDrawable(getResources(), bitmapCreateBitmap);
        }
        this.f2340i = bitmapDrawable;
    }

    @Override // androidx.fragment.app.k
    public Dialog onCreateDialog(Bundle bundle) {
        this.f2341j = -2;
        androidx.appcompat.app.g.a negativeButton = new androidx.appcompat.app.g.a(requireContext()).setTitle(this.f2335d).setIcon(this.f2340i).setPositiveButton(this.f2336e, this).setNegativeButton(this.f2337f, this);
        requireContext();
        int i10 = this.f2339h;
        View viewInflate = i10 != 0 ? getLayoutInflater().inflate(i10, (ViewGroup) null) : null;
        if (viewInflate != null) {
            c(viewInflate);
            negativeButton.setView(viewInflate);
        } else {
            negativeButton.setMessage(this.f2338g);
        }
        e(negativeButton);
        androidx.appcompat.app.g gVarCreate = negativeButton.create();
        if (this instanceof androidx.preference.a) {
            Window window = gVarCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                a.a(window);
            } else {
                f();
            }
        }
        return gVarCreate;
    }

    @Override // androidx.fragment.app.k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        d(this.f2341j == -1);
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f2335d);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f2336e);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f2337f);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f2338g);
        bundle.putInt("PreferenceDialogFragment.layout", this.f2339h);
        BitmapDrawable bitmapDrawable = this.f2340i;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
