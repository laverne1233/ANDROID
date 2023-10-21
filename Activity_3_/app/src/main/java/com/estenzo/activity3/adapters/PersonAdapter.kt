package com.estenzo.activity3.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.estenzo.activity3.PersonContextActivity
import com.estenzo.activity3.databinding.ItemBinding
import com.estenzo.activity3.model.Person

class PersonAdapter(
    private val persons: MutableList<Person>,
    private val context: Context
) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(person: Person) {
            binding.name.text = person.name
            binding.subject.text = person.subject
            binding.content.text = person.truncatedContent // Use the truncatedDescription property
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBinding.inflate(inflater, parent, false)
        return PersonViewHolder(binding)
    }

    override fun getItemCount() = persons.size

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = persons[position]

        holder.itemView.setOnClickListener {
            val intent = Intent(context, PersonContextActivity::class.java)

            // Pass the full details to PersonDetailActivity
            intent.putExtra("name", person.name)
            intent.putExtra("subject", person.subject)
            intent.putExtra("content", person.content)

            context.startActivity(intent)
        }

        holder.bind(person)
    }

}
