import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DishAdapter(private val dishes: List<Dish>) :
    RecyclerView.Adapter<DishAdapter.DishViewHolder>() {

    class DishViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.dishName)
        val desc: TextView = itemView.findViewById(R.id.dishDescription)
        val course: TextView = itemView.findViewById(R.id.dishCourse)
        val price: TextView = itemView.findViewById(R.id.dishPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_dish, parent, false)
        return DishViewHolder(view)
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        val dish = dishes[position]
        holder.name.text = dish.name
        holder.desc.text = dish.description
        holder.course.text = dish.course
        holder.price.text = "R${dish.price}"
    }

    override fun getItemCount(): Int = dishes.size
}
