package com.example.benchat.domain.helpers

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.text.SimpleDateFormat
import java.util.Date


//Custom Date to String serialization
@Serializer(forClass = Date::class)
object DateSerializer: KSerializer<Date> {

    private val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

        override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("Date", PrimitiveKind.STRING)

           override fun deserialize(decoder: Decoder): Date {
            val dateString = decoder.decodeString();
           return dateFormat.parse(dateString)?: throw  SerializationException("Failed to parse date")
        }

        override fun serialize(encoder: Encoder, value: Date) {
            val formattedDate  = dateFormat.format(value)
            encoder.encodeString(formattedDate)
        }

    }