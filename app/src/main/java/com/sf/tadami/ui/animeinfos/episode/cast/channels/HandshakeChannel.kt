package com.sf.tadami.ui.animeinfos.episode.cast.channels

import com.google.android.gms.cast.CastDevice

/**
 * Sender→receiver compatibility handshake channel. The phone registers this namespace so it can
 * push its protocol versions to the Tadami Terebi receiver as soon as a cast session connects
 * (before any media is loaded); the receiver forces an update if it's too old. Receive is a no-op —
 * this channel is send-only from the phone's side.
 */
class HandshakeChannel : CustomCastChannel() {
    override val namespace: String
        get() = NAMESPACE

    override fun onMessageReceived(castDevice: CastDevice, namespace: String, message: String) {}

    companion object {
        const val NAMESPACE: String = "urn:x-cast:com.sf.tadami.handshake"
    }
}
