package otus.homework.flowcats

import com.google.gson.annotations.SerializedName

data class FactDTO(
	@field:SerializedName("createdAt")
	val createdAt: String,
	@field:SerializedName("deleted")
	val deleted: Boolean,
	@field:SerializedName("_id")
	val id: String,
	@field:SerializedName("text")
	val text: String,
	@field:SerializedName("source")
	val source: String,
	@field:SerializedName("used")
	val used: Boolean,
	@field:SerializedName("type")
	val type: String,
	@field:SerializedName("user")
	val user: String,
	@field:SerializedName("updatedAt")
	val updatedAt: String
)

fun FactDTO.toDomainModel(): Fact {
	return Fact(this.text)
}
