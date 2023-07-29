import Link from "next/link"



export default function New() {
    return <>
      <header className="flex justify-between items-center mb-4">
        <h1 className="text-4xl">New Page</h1>
        <Link
          className=""
          href="/">Home</Link>
      </header>
      
    </>
  }
  