import com.priyanshumaurya8868.api.model.Section
import com.priyanshumaurya8868.api.service.ImgurClient.api
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class ImgurAPIv3Test {

    @Test
    fun `get hot gallery working`() = runBlocking {
        val gallery = api.getGallery(Section.HOT).body()
        Assert.assertNotNull(gallery)
    }

    @Test
    fun `get Top gallery working`() = runBlocking {
        val gallery = api.getGallery(Section.TOP).body()
        Assert.assertNotNull(gallery)
    }

    @Test
    fun `get gallery tags`() = runBlocking {
        val tags = api.getTags().body()
        Assert.assertNotNull(tags)
    }

}