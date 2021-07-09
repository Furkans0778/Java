RecyclerView 

//binding ekle dependiences

1#
yeni Resource dosyasi olustur(Linear Layout)

2#
MainActivity xml icine recyclerview olustur id!=null

3#
data class olustur (object)
=>#post
4#

class FeedRecyclerAdapter(private val itemList: ArrayList<post>) :  RecyclerView.Adapter<FeedRecyclerAdapter.PostHolder>(){ //post object  
    
	class PostHolder(val binding: RecBinding) : RecyclerView.ViewHolder(binding.root) // init class object


	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        //acilis

        val binding = RecBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostHolder(binding)
    }


  
    override fun onBindViewHolder(holder: PostHolder, index: Int) {
        //her item icin 
        
        var renkler: ArrayList<Int> = arrayListOf() renkler.add(Color.RED) renkler.add(Color.BLUE) renkler.add(Color.YELLOW)
        //yazi = TextView id
        //postList = ArrayList<post>

        //holder must binding must yazi id => layout
        holder.binding.yazi.text = postList.get(index).yazi

        try {
            //holder must binding must container id => layout
            holder.binding.container.setBackgroundColor(renkler.get(index))
        } catch (e: Throwable) {
            holder.binding.container.setBackgroundColor(Color.GREEN)
        }

    }

    override fun getItemCount(): Int {
        //item sayisi
        return postList.size
    }


} 

5#
MainActivity onCreate func

private lateinit var postAdapter : FeedRecyclerAdapter // adapter ->

//instance binding
        binding.recycView.layoutManager = LinearLayoutManager(this)
        postAdapter = FeedRecyclerAdapter(postList) //feedrecycler this template for item
        binding.recycView.adapter = postAdapter    // adapter
        postAdapter.notifyDataSetChanged()
