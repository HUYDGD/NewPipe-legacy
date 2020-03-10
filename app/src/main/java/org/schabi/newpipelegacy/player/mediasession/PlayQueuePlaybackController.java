package org.schabi.newpipelegacy.player.mediasession;

import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.Player;

public class PlayQueuePlaybackController extends DefaultControlDispatcher {
    private final MediaSessionCallback callback;

    public PlayQueuePlaybackController(final MediaSessionCallback callback) {
        super();
        this.callback = callback;
    }

    @Override
    public boolean dispatchSetPlayWhenReady(Player player, boolean playWhenReady) {
        if (playWhenReady) {
            callback.onPlay();
        } else {
            callback.onPause();
        }
        return true;
    }
}