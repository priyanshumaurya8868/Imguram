package com.priyanshumaurya8868.imguram

import android.app.Application
import android.os.Build.VERSION.SDK_INT
import coil.Coil
import coil.ImageLoader
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.decode.VideoFrameDecoder
import coil.fetch.VideoFrameFileFetcher
import coil.fetch.VideoFrameUriFetcher

class ImguramApp : Application() {

    override fun onCreate() {
        super.onCreate()
        val imageLoader = ImageLoader.Builder(this@ImguramApp)
            .componentRegistry {
                if (SDK_INT >= 28) {
                    add(ImageDecoderDecoder(this@ImguramApp))
                } else {
                    add(GifDecoder())
                }
                add(VideoFrameFileFetcher(this@ImguramApp))
                add(VideoFrameUriFetcher(this@ImguramApp))
                add(VideoFrameDecoder(this@ImguramApp))
            }
            .build()
        Coil.setImageLoader(imageLoader)
    }
}