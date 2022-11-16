package ru.dimagor555.factcard.ui.files

import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import ru.dimagor555.factcard.data.file.File
import ru.dimagor555.factcard.databinding.ListItemFileBinding

class FileItemViewHolder(
    private val binding: ListItemFileBinding
) : RecyclerView.ViewHolder(binding.root) {
    val viewForeground = binding.itemFileViewForeground

    fun bind(file: File) {
        binding.file = file
        binding.executePendingBindings()
        binding.root.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                FilesFragmentDirections.actionFilesFragmentToDrawFileFragment(file.idFile)
            )
        )
    }
}