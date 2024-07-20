package com.bankmisr.contactapp

class ContactRepository {


    companion object {
        fun getContacts():List<contact>{
            return listOf(
                contact(R.string.Contact1, R.string.numContact1, R.drawable.auntie),
                contact(R.string.Contact2, R.string.numContact2, R.drawable.brother),
                contact(R.string.Contact3, R.string.numContact3, R.drawable.daughter),
                contact(R.string.Contact4, R.string.numContact4, R.drawable.friend_1),
                contact(R.string.Contact5, R.string.numContact5, R.drawable.friend_2),
                contact(R.string.Contact6, R.string.numContact6, R.drawable.grandfather),
                contact(R.string.Contact7, R.string.numContact7, R.drawable.granny),
                contact(R.string.Contact8, R.string.numContact8, R.drawable.neigbour),
                contact(R.string.Contact9, R.string.numContact9, R.drawable.sister),
                contact(R.string.Contact10, R.string.numContact10, R.drawable.son),
                contact(R.string.Contact11, R.string.numContact11, R.drawable.uncle)
            )
        }
    }
}